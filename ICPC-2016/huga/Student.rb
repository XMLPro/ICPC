array = Array.new
for i in 1..28
	str = STDIN.gets
	num = str.to_i
  	array.push(num)
end

for i in 1..30
		if array.include?(i) then
		else STDOUT.puts i
                end
end
