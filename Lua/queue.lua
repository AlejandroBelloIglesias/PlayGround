List = {}
function List.new()
    return {
        first = 0,
        last = -1
    }
end

function List.push(list, value)
    local last = list.last + 1 -- increment the last index
    list.last = last
    list[last] = value
end

function List.pop(list)
    local first = list.first
    if first > list.last then
        error("list is empty")
    end
    local value = list[first]
    list[first] = nil -- to allow garbage collection
    list.first = first + 1
    return value
end

-- New queue
queue = List.new()
-- Add elements to the queue
List.push(queue, "Gato")
List.push(queue, "Perro")
List.push(queue, "Caballo")

print(queue.first)
print(queue.last)

-- Print the queue
for i = 0, #queue do
    print(List.pop(queue))
end

print(queue.first)
print(queue.last)
