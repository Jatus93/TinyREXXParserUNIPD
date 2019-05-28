pull x
do while x == 0 
	pull num
	pull oper
	pull onum

	if oper == 001 then do
		if onum == 0 then do
			result = 11011
		end
		else do
			result = num/onum
		end
	end

	if oper == 002 then do
		result = num*onum
	end

	if oper == 003 then do
		result = num+onum
	end

	if oper == 004 then do
		result = num-onum
	end

	say result
	pull x
end
exit 0

