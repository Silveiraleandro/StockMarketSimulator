# StockMarketSimulator
Builder I decided to use the builder pattern to get a more modular desing to my code and bring this modular approach to solve the problems. 
Using builder I can define methods to assign the values to the attributes that, using a different construction design, 
I might have to pass them all in the contructor.
By using the builder class I am free to call the methods indepently and deifine values to the methods that will not be called. 
So if I have many attributes in a class and that is the case in my Investors and Companies classes,
then it is a good idea to apply the builder 
pattern concept 

I used the Facade Pattern to hide with the difficulties of creating the IDs for Investors and Companies from the user.

I decided to use the Observer Pattern to to perform to observe when my investors were buying shares and to apply the 
changes in regards to update the value of shares, so as to drop down the values of the companies.

Unfortunatelly I could not finish the implementation of the user menu
