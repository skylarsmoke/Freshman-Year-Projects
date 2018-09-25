# ---------------------------------
# CSCI 127, Joy and Beauty of Data
# Program 1: GPA Calculator
# Skylar Smoker
# Last Modified: January 25, 2018
# ---------------------------------
# Calculates GPA after user inputs
# grades and number of credits.
# ---------------------------------

def main(): # Defines main function
    classes = int(input("Enter the number of courses you are taking: "))
    print()
    
    gpa_total = 0.0  # Establish gpa total and credit total as a float that can be added to.
    credit_total = 0

    for course in range(classes): # Establish loop "course" that repeats for the number that the user inputs.
        grade = input("Enter grade for course %d: " %(course + 1)) # Used %d to add course number that changes based off user input.
        credit = int(input("Enter credits for course %d: " %(course + 1)))
        print()

        def translate(grade): # Define the translate function, which uses if and else statements to translate grades to grade points.
            if grade == "A" or grade == "a":
                return 4.0
            elif grade == "A-" or grade == "a-":
                return 3.7
            elif grade == "B+" or grade == "b+":
                return 3.3
            elif grade == "B" or grade == "b":
                return 3.0
            elif grade == "B-" or grade == "b-":
                return 2.7
            elif grade == "C+" or grade == "c+":
                return 2.3
            elif grade == "C" or grade == "c":
                return 2.0
            elif grade == "C-" or grade == "c-":
                return 1.7
            elif grade == "D+" or grade == "d+":
                return 1.3
            elif grade == "D" or grade == "d":
                return 1.0
            elif grade == "F" or grade == "f":
                return 0.0

        gpa_total += translate(grade) * credit # Adds to the gpa_total float each time the loop operates and multiplies by the credit
        credit_total += credit # Adds the user input amount of credits to the cumulitive total
    
    calculated_grade = '{:04.2f}'.format(gpa_total / credit_total) # Calculates final GPA
     
    print ("Your GPA is ", calculated_grade) # Prints calculated GPA

main() # Calls the main function
