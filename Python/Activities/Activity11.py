fruits ={
    "apple": 100.00,
    "banana": 50,
    "mango": 80
}
fruit_to_check = input("Enter fruit name: ")

if fruit_to_check in fruits:
    print("Available")
else:
    print("Not Available")
