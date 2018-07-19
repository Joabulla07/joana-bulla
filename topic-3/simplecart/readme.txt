item----


shoppingcart:
	
	type: variable
	properties:
	totals:
		type :float

array of list items -

addshoppingitems
	required shoppingitems

delete shopping items:
	required shoppingitem to remove

list items:
	required shopping items on cart

get totals:
	set totals

search items:
	required shopping item name

checkout:
	total:
		type:float
	search items:
		example: bread
			requires quantity and price
		example milk:
			requires quantity and price
		example banana:
			requires quantity and price
return total

	




