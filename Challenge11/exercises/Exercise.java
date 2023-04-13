package Challenge11.exercises;

public class Exercise {
    /**
     * Assume that success is a boolean variable that has already been declared.
     * Also, assume that processor refers to an object that provides a void method
     * named process that takes no arguments. The process method may throw one of
     * several exceptions.
     * Write some code that calls the process method provided by the processor
     * object and handles any exception that is thrown. If an exception is thrown,
     * assign false to the success variable. Otherwise, assign true to the success
     * variable.
     */

    try{
        success = true;
        processor.process();
    }catch(Exception exp){
        success = false;
    }

    /**
    * The Integer.parseInt method throws a NumberFormatException when it is passed 
    a String argument that it cannot convert to an int.
    * Assume that a String variable named s has already been declared and assigned a value.
    * Also assume that an int variable named i has been declared.
    * Write code that uses the Integer.parseInt method to convert s to an int, and assigns the result to the variable i. If a NumberFormatException is thrown, i should be assigned the value -1.
    */

    try{
        i = Integer.parseInt(s);
    }catch(NumberFormatException exp){
        i = -1;
    }

    /**
     * 
     * Assume you have a class named AutoFactory with two static methods named shutdown and reset. Both methods are void and neither method takes any arguments. The shutdown method may throw a ProductionInProgressException.
     * Write some code that calls the shutdown method. If a ProductionInProgressException is thrown, your code should then call the reset method.
     */

    try{
        AutoFactory.shutdown();
    }catch(ProductionInProgressException ppe){
        AutoFactory.reset();
    }

    // The clause needed to identify a method as one that may throw an IOException:
    // - causes IOException 
    // - throw IOException 
    // * throws IOException
    // exception IOException

    // The clause needed to identify a method as one that may throw an IOException or a WidgetException:
    // - throws WidgetException; IOException
    // - throws IOException && WidgetException
    // - throws IOException || WidgetException
    // * throws IOException, WidgetException

    // Write the definition of an exception class named PanicException that does not have its own error message.
    public class PanicException extends Exception{
    }

    /**
     * Suppose you are writing a square root method, and you want the method to throw an exception if its argument is negative.
     * Write the definition of an exception class that can be used in this situation. The class should be named SQRTException. It should have one constructor that accepts a double as its argument. The argument the negative value that caused the problem. This constructor should create an exception object with the error message "Bad argument to sqrt: n" where n is the value of the argument.
     * Note: Only write the code for the SQRTException class.
     */

    public class SQRTException extends Exception{
    
        public SQRTException(double n){
            super("Bad argument to sqrt: " + n);
        }
    }
}
