# Writing Data to a Binary File

To write data to a binary file you must create objects from the following classes:
## FileOutputStream
This class, which is in the java. io package, allows you to open a file for writing binary data and establish a connection with it; however, it provides only basic functionality for writing bytes to the file.
This class which is in the java. io package, allows you to write data of any primitive type or String objects to a binary file.

## DataOutputStream
The DataOut putStream class by itself cannot directly access a file, however. It is used in conjunction with
a FileOutputStream object that has a connection to a file.
You wrap a DataOutputStream object around a FileOutputStream object to write data to a binary file. The following code shows how a file named MyInfo.dat can be opened for binary output:
```
FileOutputStream fstream = new FileOutputStream( "MyInfo.dat" );
```
```
DataOutputStream outputFile = new DataOutputStream(fstream);
```

## DataOutputStream methods
```
void close ()
```
Closes the file. Use this method to manually close the file when you are not using a try-with-resources statement to open it.
```
void writeBoolean (boolean b)
```
Writes the boolean value passed to b to the file.
```
void writeByte (byte b)
```
Writes the byte value passed to b to the file.
```
void writeChar (int c)
```
This method accepts an int, which is assumed to be a character code. The character it represents is written to the file as a two-byte Unicode character.
```
void writeDouble( double d)
```
Writes the double value passed to d to the file.
```
void writeFloat (float §)
```
Writes the float value passed to f to the file.
```
void writeInt (int i)
```
Writes the int value passed to i to the file.
```
void writeLong(long num)
```
Writes the long value passed to num to the file.
```
void writeShort (short s)
```
Writes the short value passed to s to the file.
```
void writeUTF (String str)
```
Writes the String object passed to str to the file using the Unicode Text Format.









