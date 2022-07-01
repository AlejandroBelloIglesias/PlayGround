#!/usr/bin/env python3                       
								    
# Data caption and validation
try:                                            
        input_field  = int(input("Enter input: "))

except ValueError:
        print("Invalid input value") # Falta algún caracter pero no afecta al programa
        quit()

# Data conversion                                     
output_field = 0                                        
i = 0                                           
while (input_field > 0):
        temporal_field = input_field % 2
        input_field = int (input_field // 2)
        output_field = output_field + temporal_field * (10**i)
        i =  i + 1
                                                                                                        
# Data output
output_field_str = str(output_field).rjust(7, '0')
print("Processed output: ",  output_field_str)