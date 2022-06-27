player1 = input("What is player1 name: ")
player2 = input("What is player2 name: ")

player1_value = input(player1 + ", which one do you want to choose rock,paper,scissors: ")
player2_value = input(player2 + ", which one do you want to choose rock,paper,scissors: ")

if player1_value == player2_value:
    print("tie")
elif player1_value == "rock" and player2_value == "scissors":
    print("rock wins")
elif player1_value == "scissors" and player2_value == "paper":
    print("scissor wins")
elif player1_value == "paper" and player2_value == "rock":
    print("paper wins")
else:
    print("Invalid option")
