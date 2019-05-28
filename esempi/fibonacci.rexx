a = 0
b = 1
c = 0

pull n

do i = 1 to n
	if i == 1 then do
		say a
	end
	if i == 2 then do 
		say a
	end
	c = a + b
	a = b
	b = c
	say c
end
exit 0
