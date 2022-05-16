def welcome(name)
    puts 'Hello ' + name + ', Welcome to our World!'
end

name = 'Cadet'
if ARGV[0]
    name = ARGV[0]
end

welcome(name)
