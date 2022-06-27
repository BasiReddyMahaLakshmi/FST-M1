list1 = [1, 2, 3, 4, 5]
list2 = [8, 9, 7, 6, 5]
list3 = []

for num in list1:
    if num % 2 != 0:
        list3.append(num)

for num in list2:
    if num % 2 == 0:
        list3.append(num)

print("new list is", list3)
