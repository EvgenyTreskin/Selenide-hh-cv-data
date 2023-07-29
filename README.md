# Selenide-hh-cv-data
We get data from Profile and compare with expected data
Test case:
1. Open the Profile from link https://github.com/EvgenyTreskin;
2. Get profile info using HashMap or Class, which contain attributes:
String sex, int numberOfRepositories, String locationCity, boolean positiveNumberOfContribution, boolean readyToRelocate;
3. Make sure that expected result and actual result are equals;
   (Expected result: sex="Male", numberOfRepositories>0, locationCity="Nizhny Novgorod", positiveNumberOfContribution=true, readyToRelocate=true);
