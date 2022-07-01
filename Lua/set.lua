function Set(list)
    local set = {}
    for _, l in ipairs(list) do
        set[l] = true
    end
    return set
end

reserved = Set {"while", "end", "function", "local"}

-- iterate
for k, v in pairs(reserved) do
    print(k, v)
end

-- Pendiente mejorar el set
-- TODO:
-- Me gustaría hacer como en el archivo queue.lua, una tabla con funciones para agregar y sacar elementos del set.