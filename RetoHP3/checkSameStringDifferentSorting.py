
# This script checks if 2 strings contain the same letters, but in different order.
# It ignores spaces and tabs.

str_1 = "rocessedprint(\"Poutp \", put: out_strieldut_f)"
str_2 = "print(\"Processed output: \",  output_field_str)"

# Remove spaces and tabs
str_1 = str_1.replace(" ", "")
str_1 = str_1.replace("\t", "")
str_2 = str_2.replace(" ", "")
str_2 = str_2.replace("\t", "")

str_1_list = list(str_1)
str_2_list = list(str_2)

str_1_list_sorted = sorted(str_1_list)
str_2_list_sorted = sorted(str_2_list)

print(str_1_list_sorted)
print(str_2_list_sorted)