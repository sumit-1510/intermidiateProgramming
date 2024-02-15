package contstdiscussion;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

public class sample {
    public static void main(String[] args) {
        String s1=null;
        String foundNull = Optional.ofNullable(s1).orElse("Found Null");
        System.out.println(foundNull);
        Boolean b1=true;
        Boolean b2=null;
        System.out.println(logicalOr(b1,b2)); //true
        Boolean b3=false;
        Boolean b4=null;
        System.out.println(logicalOr(b3,b4));//false
        Boolean b5=null;
        Boolean b6=null;
        System.out.println(logicalOr(b5,b6));//null
        Boolean b7=null;
        Boolean b8=true;
        System.out.println(logicalOr(b7,b8));//true
        Boolean b9=null;
        Boolean b10=false;
        System.out.println(logicalOr(b9,b10));// false
        Boolean b11=true;
        Boolean b12=false;
        System.out.println(logicalOr(b11,b12));//true
        Boolean b13=false;
        Boolean b14=true;
        System.out.println(logicalOr(b13,b14));//true
        Boolean b15=false;
        Boolean b16=false;
        System.out.println(logicalOr(b15,b16));//false
        Boolean b17=true;
        Boolean b18=true;
        System.out.println(logicalOr(b17,b18)); //true

        System.out.println("#############");
        System.out.println(Boolean.TRUE.equals(null));
    }
    public static Boolean logicalOr(Boolean bool1, Boolean bool2) {
        Predicate<Boolean> isNotNull = Objects::nonNull;
        // bool1 true bool2 false
        // bool1 false bool2 true
        // bool1 null bool2 true
        //bool1 null bool2 false
        //bool1 true bool2 null
        //bool1 false bool2 null
       /* return Boolean.TRUE.equals(Optional.ofNullable(bool1)
                .filter(isNotNull)
                .orElseGet(() -> Optional.ofNullable(bool2)
                        .filter(isNotNull)
                        .orElse(null)))
                || Optional.ofNullable(bool2)
                .filter(isNotNull)
                .orElse(false);*/


        return Optional.ofNullable(bool1)
               // .filter(isNotNull)
                .orElse(false)
                || Optional.ofNullable(bool2)
                //.filter(isNotNull)
                .orElse(false);

        /*return Optional.ofNullable(bool1)
                .filter(isNotNull)
                .orElseGet(() -> Optional.ofNullable(bool2)
                        .filter(isNotNull)
                        .orElse(null))
                || Optional.ofNullable(bool2)
                .filter(isNotNull)
                .orElse(false);*/
    }
}
