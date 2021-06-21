m=gets.to_i 
p=gets.to_i
q=gets.to_i

d=m-(m*(p*0.01))

e=d-(d*(q*0.01))
puts e.round(3)