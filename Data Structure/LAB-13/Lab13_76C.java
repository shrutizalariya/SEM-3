// Write a program to perform addition of two polynomial equations using 
// appropriate data structure. 

import java.util.*;
//import java.util.ListIterator;

class Term {
    int coefficient;
    int exponent;

    Term(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }
}

class Polynomial {
    LinkedList<Term> terms;

    Polynomial() {
        terms = new LinkedList<>();
    }

    void addTerm(int coefficient, int exponent) {
        if (coefficient == 0) return;

        ListIterator<Term> iterator = terms.listIterator();

        while (iterator.hasNext()) {
            Term current = iterator.next();

            if (current.exponent == exponent) {
                current.coefficient += coefficient;
                if (current.coefficient == 0) {
                    iterator.remove();
                }
                return;
            } else if (current.exponent < exponent) {
                iterator.previous();
                iterator.add(new Term(coefficient, exponent));
                return;
            }
        }

        terms.add(new Term(coefficient, exponent));
    }

    Polynomial add(Polynomial other) {
        Polynomial result = new Polynomial();

        ListIterator<Term> iterator1 = this.terms.listIterator();
        ListIterator<Term> iterator2 = other.terms.listIterator();

        while (iterator1.hasNext() && iterator2.hasNext()) {
            Term term1 = iterator1.next();
            Term term2 = iterator2.next();

            if (term1.exponent == term2.exponent) {
                result.addTerm(term1.coefficient + term2.coefficient, term1.exponent);
            } else if (term1.exponent > term2.exponent) {
                result.addTerm(term1.coefficient, term1.exponent);
                iterator2.previous();
            } else {
                result.addTerm(term2.coefficient, term2.exponent);
                iterator1.previous();
            }
        }

        while (iterator1.hasNext()) {
            Term term = iterator1.next();
            result.addTerm(term.coefficient, term.exponent);
        }

        while (iterator2.hasNext()) {
            Term term = iterator2.next();
            result.addTerm(term.coefficient, term.exponent);
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Term term : terms) {
            if (term.coefficient > 0 && sb.length() > 0) {
                sb.append(" + ");
            } else if (term.coefficient < 0) {
                sb.append(" - ");
            } else {
                sb.append(" + ");
            }

            sb.append(Math.abs(term.coefficient));

            if (term.exponent != 0) {
                sb.append("x^").append(term.exponent);
            }
        }

        return sb.toString();
    }
}

public class Lab13_76C {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.addTerm(3, 2);
        p1.addTerm(5, 1);
        p1.addTerm(6, 0);

        Polynomial p2 = new Polynomial();
        p2.addTerm(6, 1);
        p2.addTerm(8, 0);

        Polynomial sum = p1.add(p2);

        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);
        System.out.println("Sum: " + sum);
    }
}