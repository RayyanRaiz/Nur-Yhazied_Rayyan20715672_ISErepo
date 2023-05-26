# Heading
---
## 2. Modularity
### **(Scenario 1)**
**Submodule : choosingCountry**  
Imports : none  
Exports : choiceCountry (integer)  
Implements the choice of country the user intends to pick for the program, based on the string read within which contatins a list of integers with particular countries next to them. Input is taken from the keyboard for choosing the country, and the output is the retun value.

**Submodule : choosingMonth**  
Imports : none  
Exports : choiceMonth (integer)   
Implements the choice of month the user intends to pick for the program, based on the string read within which contatins a list of integers with the particular months next to them. Input is taken from the keyboard for choosing the month, and the output is the retun value.

**Submodule : countrySeason**  
Imports : pCountry (integer), pMonth(integer)  
Exports : result (String)  
Implements a submodule that imports the choice of country and month picked by the user. From these choices, other certain submodules will be run to obtain the correct result for the season of the specific country's month. Inputs are passed as parameters, and output is based on the submodules called below which will print the result on the screen.

**Submodule : australiaMeteorological**  
Imports : pMonth (integer)  
Exports : seasonAM (String)  
Implements a submodule that considers the "Australian Meteorological" seasons, and depending on the users choice of pMonth, it will return a String (seasonAM), representing one of the "Australian Meteorological" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen(String) plus the associated image of the season displayed in a window.

**Submodule : australiaNoongar**  
Imports : pMonth (integer)  
Exports : seasonAN (String)  
Implements a submodule that considers the "Australian Noongar" seasons, and depending on the users choice of pMonth, it will return a String (seasonAN), representing one of the "Australian Noongar" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

**Submodule : spainAndJapan**  
Imports : pMonth (integer)  
Exports : seasonSJ (String)  
Implements a submodule that considers the "Spain and Japan" seasons, and depending on the users choice of pMonth, it will return a String (seasonSJ), representing one of the "Spain and Japan" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

**Submodule : mauritius**  
Imports : pMonth (integer)  
Exports : seasonM (String)  
Implements a submodule that considers the "Mauritius" seasons, and depending on the users choice of pMonth, it will return a String (seasonM), representing one of the "Mauritius" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

**Submodule : malaysiaAndSriLanka**  
Imports : pMonth (integer)  
Exports : seasonMSL (String)  
Implements a submodule that considers the "Malaysia and Sri Lanka" seasons, and depending on the users choice of pMonth, it will return a String (seasonMSL), representing one of the "Malaysia and Sri Lanka" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

### **(Scenario 2)**  
**Submodule : averageTemp**  
Imports : none  
Exports : none
Implemented as the main submodule for the average temperature scenario. Its main role is to call other submodules depending on the choice the user inputs within the averageTemp module. Input taken from keyboard, and output is based on the other submodules called.

**Submodule : choosingTemp**  
Imports : none  
Exports : choiceTemp (double)
Implemented as a submodule that asks and takes in a temperature reading inserted by the user. The submodule then returns "choiceTemp" representing their temperature reading as a double. Input is taken from keyboard, and outputs a return value.

**Submodule : tempStrings**  
Imports : pTemp (double), avg (double)  
Exports : none
Implemented as a submodule that contains the results based on the imported "pTemp" (temperature reading by the user) and "avg" (users chosen temperature average based on the chosen city and time). This submodule outputs the results as Strings, and will let the user know if "pTemp" is above or below "avg" by more then 5 degrees celsius. Input passed as parameters, output is returned as strings printed on the screen.

### **(Other)**  
**Submodule : displayImage**  
Imports : pImagefile (String)
Exports : none
Implemented as a submodule to display specific images based on the import "pImagefile", the image file name matching the String import will be displayed as an image in a new window. Input is passed as a parameter, output is the image displayed in a new window.



[Link here](https://rootsofraiz.com)