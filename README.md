# LostCities
public class LostCities {
    /*Partea I

Există două echipe: Userul împotriva Calculatorului.
Scopul jocului este cucerirea tuturor localităților adversarului.
Fiecare jucător pornește cu 7 localități: 4 reședinte și 3 orașe.
Toate localitatile sunt incluse într-un ArrayList și aranjate în ordine alfabetică. Puteți folosi orice nume de orașe.
Realizați clasele Oraș și Reședință care extind Localitate.
Reședinta are 10 puncte, orașul 5 puncte.
Orașul are metoda închinăOrașul()
Reședinta are metoda închinăReședinta()
Fiecare jucător dă cu zarul o dată. Zarul are 9 fețe. Dacă calculatorul are mai puțin sau egal cu 7 mai are voie să mai dea cu zarul încă odată. Dacă utilizatorul dă ⇐ 9 mai are voie să dea cu zarul încă o dată.
Utlizatorul poate vedea cât a dat calculatorul.
La fiecare rundă câștigă cel care a dat puntajul maxim, dar numai dacă e ⇐ 10.
Dacă amândoi dau mai mult de 10 sau e egal, e remiză la acea tură.
Cine câștigă la o rundă cucerește de la adversar prima localitate din lista acestuia. Aceasta trebuie stearsă din ArrayList-ul unui jucător și adăugată la ArrayList-ul adversarului, păstrând ordinea alfabetică.
Afișați la fiecare rundă localtățile feicăruia (în ordine alfabetică), precum și punctajul.
Când o localitate trece de la un adversar la altul trebuie apelată metoda închinăOrașul() sau închinăResedinta().
Fiecare reședință are și ea câte o referință către deținător.
Câștigă cel ce a luat toate localitățile de la adversar.
