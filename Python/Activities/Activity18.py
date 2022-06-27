import pandas

dataframe = pandas.read_csv('data.csv')

print("output of file---------", dataframe)

print("Values in Username and passwords of second row----")
print(dataframe["Usernames"][1], dataframe["Passwords"][1])

print("Values in Username column----")
print(dataframe["Usernames"])

print("Values in Username column ascending order----")
print(dataframe.sort_values("Usernames"))

print("Values in password column descending order----")
print(dataframe.sort_values("Passwords", ascending=False))

