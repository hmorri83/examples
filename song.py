#Prints a song with a cumulative verse.
cumVer = []

#plays the cumulative lines in order
def verse():
	x = 0
	while x < len(cumVer):
		eval(cumVer[x] + '()')
		x += 1

#prints the lines about the fly with the line from the unique first printed the first pass only.		
def fly():
	if "fly" not in cumVer:
		print("There was an old woman who swallowed a fly")
		cumVer.append("fly")
		verse()
	else:
		print("I don't know why she swallowed the fly,")
		print("Perhaps she'll die!")
		print("")	

#prints the lines about the s[ider with the lines from the unique first printed the first pass only.
def spider():
	if "spider" not in cumVer:
		print("There was an old woman who swallowed a spider,")
		print("That wriggled and iggled and jiggled inside her.")
		cumVer.insert(0, "spider")
		verse()
	else:
		print("She swallowed the spider to catch the fly,")

#prints the lines about the bird with the lines from the unique first printed the first pass only.
def bird():
	if "bird" not in cumVer:
		print("There was an old woman who swallowed a bird,")
		print("How absurd to swallow a bird.")
		cumVer.insert(0, "bird")
		verse()
	else:
		print("She swallowed the bird to catch the spider,")	

#prints the lines about the cat with the lines from the unique first printed the first pass only.
def cat():
	if "cat" not in cumVer:
		print("There was an old woman who swallowed a cat,")
		print("Imagine that to swallow a cat.")
		cumVer.insert(0, "cat")
		verse()
	else:
		print("She swallowed the cat to catch the bird,")

#prints the lines about the dog with the lines from the unique first printed the first pass only.
def dog():
	if "dog" not in cumVer:
		print("There was an old woman who swallowed a dog,")
		print("What a hog to swallow a dog.")
		cumVer.insert(0, "dog")
		verse()
	else:
		print("She swallowed the dog to catch the cat,")

#Prints the entire song.
fly()
spider()
bird()
cat()
dog()

print("There was an old woman who swallowed a bear,")
print("Without a care she swallowed a bear.")
print("She swallowed the bear to catch the dog,")
verse()

print("There was an old woman who swallowed a horse,")
print("She died of course.")