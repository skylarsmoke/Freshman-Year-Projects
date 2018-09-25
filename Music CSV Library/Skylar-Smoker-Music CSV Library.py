# ---------------------------------------
# CSCI 127, Joy and Beauty of Data
# Program 3: Music CSV Library
# Skylar Smoker
# Last Modified: February 22, 2018 
# ---------------------------------------
# This program reads a csv file to determine
# which song is the longest, how many songs
# from a specified year there are, all the
# songs written by a specified artist, and
# all the songs from a specific genre.
# ---------------------------------------

def longest_song(): # Defines the function longest_song
    print()
    music_file = open("music.csv", "r") # Opens music.csv file for reading
    one_line = music_file.readline()
    max_length = 0
    for one_line in music_file: # Creates a loop that repeats for ever line in music_file
        values = one_line.split(',')
        if float(values[9]) >= max_length: # If statement that checks if the duration of the song is the longest
            max_length = float(values[9])
            title = values[-2]
    print("Title: " + str(title))
    print("Length to nearest second: " + str('{:04.0f}'.format(max_length)))
    music_file.close()

def songs_by_year(year): # Defines the function songs_by_year
    music_file = open("music.csv", "r")
    one_line = music_file.readline() # Tells the for loop to read each line seperate
    songs = 0 # Establishes a float for total of songs that can be added to
    for one_line in music_file:
        values = one_line.split(',')
        if year == int(values[-1]): # If the year equals the year on the line then 1 song is added to the total
            songs += 1
    print("The number of songs from " + str(year) + " is " + str(songs))
    music_file.close() 

def all_songs_by_artist(artist): # Defines the function all_songs_by_artist
    print("")
    print("Songs In Alphabetical Order")
    print("---------------------------")
    music_file = open("music.csv", "r")
    one_line = music_file.readline()
    song = 0
    for one_line in music_file:
        values = one_line.split(',')
        if artist == values[2].lower():
            song += 1
            print(str(song) + " " + values[-2])
    if song == 0:
        print("There are no songs by this artist.")
    print("---------------------------")     
    music_file.close()

def all_genres(genre): # Defines the function all_genres
    music_file = open("music.csv", "r")
    one_line = music_file.readline()
    songs = 0
    for one_line in music_file:
        values = one_line.split(',')
        if genre == values[-6].lower():
            songs += 1
    print("The number of " + genre + " songs is " + str(songs))
    music_file.close()

# --------------------------------------

def menu():
    print()
    print("1. Identify longest song.")
    print("2. Identify number of songs in a given year.")
    print("3. Identify all songs by a given artist.")
    print("4. Identify number of songs from a given genre.")
    print("5. Quit.")

# --------------------------------------

def main():
    choice = 0
    while (choice != 5):
        menu()
        choice = int(input("Enter your choice: "))
        if (choice == 1):
            longest_song()
        elif (choice == 2):
            year = int(input("Enter desired year: "))
            songs_by_year(year)
        elif (choice == 3):
            artist = input("Enter name of artist: ").lower()
            all_songs_by_artist(artist)
        elif (choice == 4):
            genre = input("Enter name of genre: ").lower()
            all_genres(genre)
        elif (choice != 5):
            print("That is not a valid option.  Please try again.")

# --------------------------------------

main()
