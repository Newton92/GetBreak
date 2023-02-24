
# When we code, we often need to take a break, this little java project is here to remind you


Usage :

javac Main.java


Using the Main class only:

For example, if you want to run 2 sessions of 25 minutes with a 5 minute break, 

you can use the following command:

java Main -s 2 -d 25 -p 5


In case you use an ide,

with intelleji for example:
If you need to pass arguments to your program, you can do it in the configuration of the execution profile. To do so :

Click on "Edit Configurations" in the "Run" menu.
In the configuration window, click on the "+" button in the upper left corner and select "Application".
Give the configuration a name and select the main class.
In the "Program arguments" section, enter the necessary arguments (for example, "-s 2 -d 25 -p 5").
Click "Apply" and "OK".
Run the program using this configuration by clicking "Run" icon or by pressing Shift+F10 key. The arguments will be automatically passed to the program.