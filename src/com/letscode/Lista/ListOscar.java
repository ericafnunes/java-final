    package com.letscode.Lista;


    import com.letscode.Entities.Oscar;

    import javax.naming.Name;
    import java.util.Scanner;
    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    import java.nio.file.Path;
    import java.nio.file.Paths;
    import java.util.*;
    import java.lang.String;
    import java.util.stream.Collectors;


    public class ListOscar {
        public static void main(String[] args) throws IOException {
            Path path1 = Paths.get("/home/ericafnunes/Downloads/oscar_age_male.csv");
            Path path2 = Paths.get("/home/ericafnunes/Downloads/oscar_age_female.csv");

            List<Oscar> listOscarMale = new ArrayList<>();
            listOscarMale = readlist(path1);

            List<Oscar> listOscarFemale = new ArrayList<>();
            listOscarFemale = readlist(path2);

            String actorYoungest = actorYoung(listOscarMale);
            String actressAward = actressYoungest(listOscarFemale);
            String actressAge = actressAgePremio(listOscarFemale);


            Scanner reader = new Scanner(path1);
            List<Oscar> infoOscars = new ArrayList<>();

        }
        public static String actorYoung (List<Oscar> oscars){
            String actorYoungest = oscars.stream().min(Comparator.comparing(x -> x.getAge())).get().getName();
            System.out.println("ATOR MAIS NOVO A GANHAR O OSCAR FOI: " + actorYoungest);
            System.out.println("------------------------------------------------------");
            return actorYoungest;
        }

        public static String actressYoungest (List<Oscar> oscars){
            String actressAward = oscars.stream().collect(Collectors.groupingBy(Oscar::getName, Collectors.counting()))
                    .entrySet().stream().max((x1, x2) -> x1.getValue().intValue() - x2.getValue().intValue()).get().getKey();
            System.out.println("ATRIZ QUE FOI MAIS VEZES PREMIADA: " + actressAward);
            System.out.println("------------------------------------------------------");
            return actressAward;
        }

        public static String actressAgePremio (List<Oscar> oscars){
            String actressAge = String.valueOf(oscars.stream().filter(x -> x.getAge() >= 20 && x.getAge() <= 30).collect(Collectors.toList()));
            System.out.println("ATRIZES ENTRE 20 E 30 ANOS QUE MAIS VEZES FORAM PREMIADAS: " + actressAge);
            System.out.println("------------------------------------------------------");
            return actressAge;
        }


        public static List<Oscar> readlist(Path path) {
            List<Oscar> list = new ArrayList<>();
            List<Oscar> listFemale = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(String.valueOf(path)))) {

                String line = br.readLine();
                line = br.readLine();
                while (line != null) {
                    String[] vect = line.split(",");
                    String Year = vect[1];
                    Integer Age = Integer.parseInt(vect[2]);
                    String Name = vect[3];
                    String Movie = vect[4];

                    Oscar osca = new Oscar(Year, Age, Name, Movie);

                    list.add(osca);
                    listFemale.add(osca);


                    line = br.readLine();
                }
                System.out.println("LISTA DE ATORES");
                System.out.println("-------------------------------------------------------------------------------------------");
                for (Oscar p : list)
                    System.out.println(p);
                for (Oscar p :listFemale)
                    System.out.println(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return list;
        }

    }