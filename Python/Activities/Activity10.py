num_tuple = []

num = int(input("Please enter the total number of list elements : "))
for i in range(1, num+1):
    value = int(input("Please enter the value of element %d : " %i))
    num_tuple.append(value)
    
print("Given list is ", num_tuple)

print("Elements that are divisible by 5:")
for num in num_tuple:
    if num % 5 == 0:
        print(num)