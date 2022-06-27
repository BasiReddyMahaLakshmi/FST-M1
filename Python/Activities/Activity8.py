list = []

num = int(input("Please enter the Total Number of List Elements : "))
for i in range(1, num+1):
    value = int(input("Please enter the Value of Element %d : " %i))
    list.append(value)

firstElement = list[0]
lastElement = list[-1]
if firstElement == lastElement:
    print(True)
else:
    print(False)

