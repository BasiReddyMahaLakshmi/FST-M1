def fibonacci(n):
    if n <= 1:
        return n
    else:
        return(fibonacci(n-1) + fibonacci(n-2))


number = int(input("Enter the number: "))

if number <= 0:
    print("enter a valid number")
else:
    print("Fibonacci sequence:")
    for i in range(number):
        print(fibonacci(i))