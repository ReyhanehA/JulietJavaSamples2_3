/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__getParameterServlet_multiply_09.java
Label Definition File: CWE191_Integer_Underflow.label.xml
Template File: sources-sinks-09.tmpl.java
*/
/*
* @description
* CWE: 191 Integer Underflow
* BadSource: getParameterServlet Read data from a querystring using getParameter
* GoodSource: A hardcoded non-zero, non-min, non-max, even number
* Sinks: multiply
*    GoodSink: Ensure there will not be an overflow before performing the multiplication
*    BadSink : Unchecked multiplication, which can lead to overflow
* Flow Variant: 09 Control flow: if(IO.static_final_t) and if(IO.static_final_f)
*
* */

package testcases.CWE191_Integer_Underflow;

import testcasesupport.*;

import java.sql.*;
import javax.servlet.http.*;

import javax.servlet.http.*;
import java.util.logging.Logger;

import java.security.SecureRandom;

public class CWE191_Integer_Underflow__getParameterServlet_multiply_09 extends AbstractTestCaseServlet
{

    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            Logger log_bad = Logger.getLogger("local-logger");
            /* init Data$ */
            data = -1;
            /* read parameter from request */
            String s_data = request.getParameter("name");
            data = Integer.parseInt(s_data.trim());
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");

            /* FIX: Use a hardcoded number that won't cause underflow, overflow,
                    divide by zero, or loss-of-precision issues */
            data = 2;

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            int valueToMult = (new SecureRandom()).nextInt(98) + 2; /* multiply by at least 2 */
            if(data < 0)   /* ensure we don't have an overflow */
            {
                /* POTENTIAL FLAW: if (data*valueToMult) < MIN_VALUE, this will overflow */
                int result = (data * valueToMult);
                IO.writeLine("result: " + result);
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            int valueToMult = (new SecureRandom()).nextInt(98) + 2; /* multiply by at least 2 */

            if(data < 0)   /* ensure we don't have an overflow */
            {
                int result = 0;
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data >= (Integer.MIN_VALUE/valueToMult))
                {
                    result = (data * valueToMult);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("Input value is too small to perform multiplication.");
                }
            }

        }

    }

    /* goodG2B1() - use goodsource and badsink by changing first IO.static_final_t to IO.static_final_f */
    private void goodG2B1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        /* INCIDENTAL: CWE 570 Statement is Always False */
        if(IO.static_final_f)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            Logger log_bad = Logger.getLogger("local-logger");
            /* init Data$ */
            data = -1;
            /* read parameter from request */
            String s_data = request.getParameter("name");
            data = Integer.parseInt(s_data.trim());
        }
        else {

            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");

            /* FIX: Use a hardcoded number that won't cause underflow, overflow,
                    divide by zero, or loss-of-precision issues */
            data = 2;

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            int valueToMult = (new SecureRandom()).nextInt(98) + 2; /* multiply by at least 2 */
            if(data < 0)   /* ensure we don't have an overflow */
            {
                /* POTENTIAL FLAW: if (data*valueToMult) < MIN_VALUE, this will overflow */
                int result = (data * valueToMult);
                IO.writeLine("result: " + result);
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            int valueToMult = (new SecureRandom()).nextInt(98) + 2; /* multiply by at least 2 */

            if(data < 0)   /* ensure we don't have an overflow */
            {
                int result = 0;
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data >= (Integer.MIN_VALUE/valueToMult))
                {
                    result = (data * valueToMult);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("Input value is too small to perform multiplication.");
                }
            }

        }
    }

    /* goodG2B2() - use goodsource and badsink by reversing statements in first if */
    private void goodG2B2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");
            /* FIX: Use a hardcoded number that won't cause underflow, overflow,
                    divide by zero, or loss-of-precision issues */
            data = 2;
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            Logger log_bad = Logger.getLogger("local-logger");

            /* init Data$ */
            data = -1;

            /* read parameter from request */
            String s_data = request.getParameter("name");
            data = Integer.parseInt(s_data.trim());

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            int valueToMult = (new SecureRandom()).nextInt(98) + 2; /* multiply by at least 2 */
            if(data < 0)   /* ensure we don't have an overflow */
            {
                /* POTENTIAL FLAW: if (data*valueToMult) < MIN_VALUE, this will overflow */
                int result = (data * valueToMult);
                IO.writeLine("result: " + result);
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            int valueToMult = (new SecureRandom()).nextInt(98) + 2; /* multiply by at least 2 */

            if(data < 0)   /* ensure we don't have an overflow */
            {
                int result = 0;
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data >= (Integer.MIN_VALUE/valueToMult))
                {
                    result = (data * valueToMult);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("Input value is too small to perform multiplication.");
                }
            }

        }
    }

    /* goodB2G1() - use badsource and goodsink by changing second IO.static_final_t to IO.static_final_f */
    private void goodB2G1(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            Logger log_bad = Logger.getLogger("local-logger");
            /* init Data$ */
            data = -1;
            /* read parameter from request */
            String s_data = request.getParameter("name");
            data = Integer.parseInt(s_data.trim());
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");

            /* FIX: Use a hardcoded number that won't cause underflow, overflow,
                    divide by zero, or loss-of-precision issues */
            data = 2;

        }
        /* INCIDENTAL: CWE 570 Statement is Always False */
        if(IO.static_final_f)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            int valueToMult = (new SecureRandom()).nextInt(98) + 2; /* multiply by at least 2 */
            if(data < 0)   /* ensure we don't have an overflow */
            {
                /* POTENTIAL FLAW: if (data*valueToMult) < MIN_VALUE, this will overflow */
                int result = (data * valueToMult);
                IO.writeLine("result: " + result);
            }
        }
        else {

            int valueToMult = (new SecureRandom()).nextInt(98) + 2; /* multiply by at least 2 */

            if(data < 0)   /* ensure we don't have an overflow */
            {
                int result = 0;
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data >= (Integer.MIN_VALUE/valueToMult))
                {
                    result = (data * valueToMult);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("Input value is too small to perform multiplication.");
                }
            }

        }
    }

    /* goodB2G2() - use badsource and goodsink by reversing statements in second if  */
    private void goodB2G2(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            Logger log_bad = Logger.getLogger("local-logger");
            /* init Data$ */
            data = -1;
            /* read parameter from request */
            String s_data = request.getParameter("name");
            data = Integer.parseInt(s_data.trim());
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log_good = java.util.logging.Logger.getLogger("local-logger");

            /* FIX: Use a hardcoded number that won't cause underflow, overflow,
                    divide by zero, or loss-of-precision issues */
            data = 2;

        }
        /* INCIDENTAL: CWE 571 Statement is Always True */
        if(IO.static_final_t)
        {
            int valueToMult = (new SecureRandom()).nextInt(98) + 2; /* multiply by at least 2 */
            if(data < 0)   /* ensure we don't have an overflow */
            {
                int result = 0;
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data >= (Integer.MIN_VALUE/valueToMult))
                {
                    result = (data * valueToMult);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("Input value is too small to perform multiplication.");
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            int valueToMult = (new SecureRandom()).nextInt(98) + 2; /* multiply by at least 2 */

            if(data < 0)   /* ensure we don't have an overflow */
            {
                /* POTENTIAL FLAW: if (data*valueToMult) < MIN_VALUE, this will overflow */
                int result = (data * valueToMult);
                IO.writeLine("result: " + result);
            }

        }
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B1(request, response);
        goodG2B2(request, response);
        goodB2G1(request, response);
        goodB2G2(request, response);
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
