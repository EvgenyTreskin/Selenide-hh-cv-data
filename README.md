# Selenide-hh-cv-data
We get data from CV and compare with expected data
Test case:
1. Open the CV from link https://github.com/EvgenyTreskin;
2. Get profile info using HashMap or Class, which contain attributes:
String sex, int numberOfRepositories, String location, boolean positiveNumberOfContribution, boolean readyToRelocate;
3. Make sure that expected result and actual result are equals;
   (Expected result: sex="M", numberOfRepositories=9, location="Nizhny Novgorod", positiveNumberOfContribution=true, readyToRelocate=true);
