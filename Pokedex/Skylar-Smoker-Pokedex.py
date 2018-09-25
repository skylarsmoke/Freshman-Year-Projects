import string

# ---------------------------------------
# CSCI 127, Joy and Beauty of Data
# Program 4: Pokedex
# Skylar Smoker
# Date: March 3, 2018
# ---------------------------------------
# This program allows the user to view
# the Pokedex, look up Pokemon by name,
# look up Pokemon by number, view the
# amount of Pokemon in the Pokedex, and
# view the total amount of CP collectively
# from all the Pokemon.
# ---------------------------------------

class Pokemon: #Establishes the Pokemon class

    def __init__(self, name, number, combat_points, types): #Establishes initialize method
        self.types = types
        self.name = name
        self.number = number
        self.combat_points = combat_points

    def __str__(self): #Default the string method to display a pokemon
        return "Number: " + str(self.number) + ", Name: " + str(self.name) + ", CP: " + str(self.combat_points) + ", Type: " + self.types[0] + " and " + self.types[-1]

def lookup_by_name(pokedex, name): #Defines the function lookup_by_name
    file = open("pokedex.txt", "r") #Opens the file pokedex.txt for reading
    for pokemon in file:
        values = pokemon.split(',') #Specifies that each comma is a new item in the list
        if name == values[1]:
            print("Number: " + str(values[0]) + ", Name: " + str(values[1]) + ", CP: " + str(values[2]) + ", Type: " + values[3] + " and " + values[-1])
    print()
    
def lookup_by_number(pokedex, number): #Defines the function lookup_by_number
    if number == str: #If user inputs a non-integer the line below will be printed
        print("That is not a number, try again.")
    file = open("pokedex.txt", "r")
    for pokemon in file: #For every line in the file it will check the conditions below
        values = pokemon.split(',')
        if str(number) == str(values[0]): #If the number inputed is equal to the pokemon on the line read then that pokemons stats will be printed
            print("Number: " + str(values[0]) + ", Name: " + str(values[1]) + ", CP: " + str(values[2]) + ", Type: " + values[3] + " and " + values[-1])
    if number > 30: #If the number inputted is higher than 30 then the line below will be printed
        print("Pokemon number " + str(number) + " is not in the Pokedex")
    print()

def how_many_pokemon(pokedex): #Defines the function how_many_pokemon
    print("There are " + str(len(pokedex)) + " different Pokemon") #Prints the length of the pokedex list
    print()

def how_many_hit_points(pokedex): #Defines the function how_many_hit_points
    cp = 0 #Establishes a float named cp
    file = open("pokedex.txt", "r")
    for pokemon in file:
        values = pokemon.split(',')
        cp += int(values[2])
    print("The total number of combat points for all Pokemon in the Pokedex is " + str(cp))
    print()

def print_menu(): #Defines the function print_menu
    print("1. Print Pokedex")
    print("2. Lookup Pokemon by Name")
    print("3. Lookup Pokemon by Number")
    print("4. Print Number of Pokemon")
    print("5. Print Total Hit Points of All Pokemon")
    print("6. Quit")

def print_pokedex(pokedex):
    print()
    print("The Pokedex")
    print("-----------")
    for pokemon in pokedex: #Prints the __str__ method
        print(pokemon)
    print("-----------")
    print("End Pokedex")
    print()

# ---------------------------------------
# Do not change anything below this line
# ---------------------------------------

def create_pokedex(filename):
    pokedex = []
    file = open("pokedex.txt", "r")
    
    for pokemon in file:
        pokelist = pokemon.strip().split(",")
        number = int(pokelist.pop(0))           # number
        name = pokelist.pop(0)                  # name
        combat_points = int(pokelist.pop(0))    # hit points
        types = [pokelist.pop(0)]               # type
        if len(pokelist) == 1:
            types += [pokelist.pop(0)]          # optional second type
        pokedex += [Pokemon(name, number, combat_points, types)]

    file.close()
    return pokedex

# ---------------------------------------

def get_choice(low, high, message):
    legal_choice = False
    while not legal_choice:
        legal_choice = True
        answer = input(message)
        for character in answer:
            if character not in string.digits:
                legal_choice = False
                print("That is not a number, try again.")
                break 
        if legal_choice:
            answer = int(answer)
            if (answer < low) or (answer > high):
                legal_choice = False
                print("That is not a valid choice, try again.")
    return answer

# ---------------------------------------

def main():
    pokedex = create_pokedex("pokedex.txt")
    choice = 0
    while choice != 6:
        print_menu()
        choice = get_choice(1, 6, "Enter a menu option: ")
        if choice == 1:    
            print_pokedex(pokedex)
        elif choice == 2:
            name = input("Enter a Pokemon name: ")
            name = name.capitalize()
            lookup_by_name(pokedex, name)
        elif choice == 3:
            number = get_choice(1, 1000, "Enter a Pokemon number: ")
            lookup_by_number(pokedex, number)
        elif choice == 4:
            how_many_pokemon(pokedex)
        elif choice == 5:
            how_many_hit_points(pokedex)
    print("Thank you.  Goodbye!")

# ---------------------------------------

main()
