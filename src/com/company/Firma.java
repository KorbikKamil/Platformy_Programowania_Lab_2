package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Firma implements Iterable<Pracownik> {
    private final ArrayList<Pracownik> workersList = new ArrayList<>();

    public void addWorker(String imie, String nazwisko, Stanowisko stanowisko, double pensja) {
        Pracownik worker = new Pracownik(imie, nazwisko, stanowisko, pensja);
        workersList.add(worker);
    }

    public int numberOfWorkers() {
        return workersList.size();
    }

    public void listOfWorkers() {
        for (Pracownik worker : workersList) {
            System.out.println(worker);
        }
    }

    public double averageSalary(){
        double avg = 0;
        int counter = 0;
        for (Pracownik pracownik : this) {
            avg += pracownik.pensja;
            counter++;
        }
        return avg/counter;
    }


    public double averageSalary(Stanowisko s){
        double avg = 0;
        int counter = 0;
        for(Iterator<Pracownik> p = iterator(s); p.hasNext(); ){
            Pracownik pracownik = p.next();
            avg+=pracownik.pensja;
            counter++;
        }
        return avg/counter;
    }


    @Override
    public Iterator<Pracownik> iterator() {
        return new Iterator<Pracownik>() {

            private int currentPointer = 0;

            @Override
            public boolean hasNext() {
                return (currentPointer < workersList.size() && workersList.get(currentPointer) != null);
            }

            @Override
            public Pracownik next() {
                return workersList.get(currentPointer++);
            }
        };
    }


    public Iterator<Pracownik> iterator(Stanowisko s) {

        List<Pracownik> sWorkers = workersList.stream()
                .filter(workersList -> workersList.stanowisko.equals(s))
                .collect(Collectors.toList());

        return new Iterator<Pracownik>() {
            private int currentPointer = 0;

            @Override
            public boolean hasNext() {
                return (currentPointer < sWorkers.size() && sWorkers.get(currentPointer) != null);
            }

            @Override
            public Pracownik next() {
                return sWorkers.get(currentPointer++);
            }
        };
    }
}

