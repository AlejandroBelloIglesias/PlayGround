
-- DOCUMENTACIÓN: https://www.lua.org/pil/1.html --

--[[ Multi-line comment

COSITAS:

• No hay clases

--]]

-- VARIABLES --
-- Tipado dinámico (Como en Python)
--[[
print(type("Hello world"))  --> string
print(type(10.4*3))         --> number
print(type(print))          --> function
print(type(type))           --> function
print(type(true))           --> boolean
print(type(nil))            --> nil
]]--

--print(non_existent_variable) --> Nil
g_hello = "Hello World!" --Variable global
local l_hello = "Hello Mom!" --Variable local
--print(g_hello) --> Hello World
--print(l_hello) --> Hello Mom

-- Numbers --
-- Valid examples--
--[[
print(4)
print(0.4)
print(4.57e-3) -- 0.00457
print(0.3e12) -- 300000000000.0
print(5e+20) -- 500000000000000000000.0 (20 zeros)
]]--

-- FUNCIONES --

function half(x)
    return x / 2
end

--print(half(5))

-- ESTRUCTURAS DE DATOS --

-- TABLAS --
-- Única estructura de datos, dinámica, asociativa

-- array
table = {"Gato", "Perro", "Caballo", "Vaca"} --EL ÍNDICE EMPIEZA EN 1 !!!
table[1] = "Otra cosa" -- Es mutable

for i = 1, #table do
    --print(table[i])
end

--For those that really want their arrays starting at 0, it is not difficult to write the following:
days = {[0]="Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}

-- dictionary
dict = {
    ["Gato"] = "Cat", 
    ["Perro"] = "Dog", 
    ["Caballo"] = "Horse", 
    ["Vaca"] = "Cow"
}
dict["Gato"] = "Miauuu" -- Es mutable

for k,v in pairs(dict) do
    --print(k,v)
end

-- record
a = {x=0, y=0}
-- which is equivalent to a = {}; a.x=0; a.y=0
--print(a.x)

-- linked list using table values
text = [[
    Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    Mauris euismod, nunc eu aliquet aliquet, nisl nisl pretium nunc,
]]

list = nil
print(string.gmatch(text, "[^\n]+"))
for line in string.gmatch(text, "[^\n]+") do
    list = {next = list, value = line}
end

l = list
while l do
    print(l.value)
    l = l.next
end

-- INPUT --
print("enter a number:")
a = io.read("*number")
print("You entered:", a)

-- CONDICIONALES --

-- a ? b : c -- Operador ternario
max = (a > b) and a or b

