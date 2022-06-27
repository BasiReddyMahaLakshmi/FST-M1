numList = []

num = int(input("Please enter the total number of list elements : "))
for i in range(1, num+1):
    value = int(input("Please enter the value of element %d : " %i))
    numList.append(value)

total = sum(numList)
print("The sum of all elements in the List is : ", total)