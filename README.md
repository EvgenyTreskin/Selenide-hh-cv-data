# Selenide-hh-cv-data
We get data from CV and compare with expected data
Test case:
1. Open the CV from link https://nn.hh.ru/applicant/resumes/view?resume=0ba3c37eff0b5b5ee70039ed1f79714e716745
   (you need to be authorized on hh.ru);
2. Get profile info using HashMap or Class, which contain attributes:
   String sex, int age, String city, boolean confirmedPhoneNumber, boolean readyToRelocate;
3. Make sure that expected result and actual result are equals;
   (Expected result: sex="M", age=25, city="Nizhny Novgorod", confirmedPhoneNumber=true, readyToRelocate=true);
