import sys


def welcome(name):
    print("Hello " + name + ", Welcome to our World!")

name = "Cadet"
if sys.argv[1:]:
    name = str(sys.argv[1])

welcome(name)
