import pandas
dataframe = pandas.read_excel("userinfo.xlsx", sheet_name="Sheet1")
print(dataframe)

print("number of row and columns is", dataframe.shape)
print("data from emails columns is---------")
print(dataframe["Email"])
print("data of FirstName in ascending order")
print(dataframe.sort_values('FirstName'))
