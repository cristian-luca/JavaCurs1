package javaExercises.testJava;

public class ExNr4 {
    /*
    Intrebare: Cum definim limbajul Java si ce avantaje are acesta?
    1. este un limbaj OOP;
    2. este un limbaj C++;
    3. portabilitatea;
    Raspuns: 1. si 3.
    ==================================================================
    Intrebare: Pasii de realizare si de rulare a unui program java:
    1. fisierul.class - fisierul.java - JVM;
    2. fisierul.java - JVM - fisierul.java;
    3. fisierul.java - fisierul.class - JVM;
       Raspuns: 3.
       ==================================================================
       Intrebare:
       Tipuri de date primitive in Java:
       1. char, int, String, Object, Persoane;
       2. void, boolean, short, char;
       3. object, String, Persoane, void;
       Raspuns: 2.
       ==================================================================
       Intrebare:
       Se dau urmatoarele linii de cod. Spuneti daca obiectele sunt egale, prin A au F:
       String s1 = "Caine";
       String s2 = new String("Cat");
       char elem = 'a';
       String s3 = "Caine";
       1. s1 == s3, imutabil, datele nu pot fi schimbate;
       2. s2 == s3, datele String-ului nu se mai pot schimba;
       3. s3 == elem, tip de date primitive;
       4. toate variantele de mai sus;
       Raspuns: 1.A ; 2.F ; 3.F ; 4. F;
       Intrebare suplimentara:
       Ce este un String in Java, ce caracteristici are?
       Raspuns: a se vedea teoria de la Java_Curs_1
       ==================================================================
       Cerinta:
       Explicati ce este o clasa, care e structura unei clase si
       cum se defineste un obiect al clasei repective?
       Raspuns: a se vedea teoria de la Curs3_Java
       Clasa este un sablon care are rolul de a construi obiecte.
       Crearea de obiecte ale unei clase poarta numele de ”instanta a clasei”
       ....................................................................
        ===================================================================
       Cerinta:
       Ce rol are Constructorul intr-o clasa si cum se scrie el. Se da
       clasa Persoane. Scrieti un constructor fara parametru si cu parametru
       pentru clasa mentionata mai sus.
       Raspuns: a se vedea teoria de la Curs3_Java
       Este folosit pentru a initializa un obiect.
       Constructorul este folosit pentru a da o stare obiectului.
       Are acelasi nume cu clasa
       Se initializeaza cand se creaza un obiect si se adauga intre paranteze
       Constructorul nu are return type
       Daca nu avem un constructor adaugat de noi. Java va adauga un constructor default.
       Constructorul este o metoda speciala care poate avea parametri , nu are return type
       Exista 2 tipuri de constructori : constructor default si cel parametrizat.
       Apelarea unui constructor in alt constructor se face cu ”this.numeConstructor”.
        ..................................................................................
        ===================================================================
        Intrebare:
        Enumerati cele 4 principii OOP.
        Raspuns:
        Abstraction, encapsulation, polymorphism, and inheritance.
        ===================================================================
        Intrebare:
        Se da urmatoarea sectiune de cod, folositi unul dintre principiile OOP si
        continuati codul:
        public class Persoane {
            private String name;
            private String id;
            private int age;

            ..............}
        Raspuns:
        Pentru accesarea si scrierea unei valori a unui atribut al clasei se vor
        folosi doua metode speciale : Getter si Setter(folosim principiul Incapsularii).
        De exemplu,
        public String getName() {   //getter
        return name;
         }
           si
        public void setName(String name) {  //setter
            this.name = name;
        }
        ===================================================================
        Intrebare:
        Metodele statice pot accesa membri non-statici ai clasei?
        Raspuns:
        False
        =====================================================================
        Sa studiem si micile programe lucrate in IJ sub indrumarea mentorului Alex!
     */
}
