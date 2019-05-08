pull x
result = 1
do y = 0 to x
    result = result * (x-y)
end
if result > 50 then do
    exit 1
end
else do
    exit 0
end
