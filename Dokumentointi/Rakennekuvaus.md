QuizQuest-pelin luokkien rakennekuvaus ik��nkuin hierarkkisessa j�rjestyksess�.


Seikkailija-luokassa m��ritell��n pelin pelaaja ja asetetaan h�nelle aloituspisteet
Luokassa on my�s kaikki metodit jotka liittyv�t pelaajan nimenmuutoksiin ja Superit pisteiden saantiin/v�hennyksiin.
Seikkailija-luokka siis k�ytt�� pisteytys luokkaa.

Pisteytys-luokassa m��ritell��n tarkemmin kuinka pisteit� saadaan nollataan ja asetetaan.

Kysymys-luokassa m��ritell��n yksitt�inen kysymys ja sen vastaus, sek� parametri onko se kysytty jo.
Luokassa asetetaan my�s Kysymyksen tulostusasu. 

KysymysLista-luokassa k�ytt�� kysymysluokkaa m��rittelem��n listan kysytt�vist� ja kysytyist� kysymyksist�.
Kysytt�v�t kysymykset laitetaan luokassa listaan. Listalle m��ritell��n metodit sen sekoittamiseen ja tulostamiseen.
Luokassa on my�s lista jo kysytyist� kysymyksist� ja metodi joka lis�� kysymyksen niihin.

Peli-luokka luo pelin k�ytt�j�n k�ytt�m�ll� Seikkailija luokkaa, tekee kysymyslistaa k�ytt�en kysytt�v�t kysymykset ja m��ritt�� oikean vastauksen. Luokka my�s arpoo uuden kysymyksen mik�li se on jo kysytty.
Peli-luokassa on my�s metodi lopussa tulostettavalle tarinalle.

Grafiikka luokassa m��ritell��n pelin ulkoasu sek� Oikein ja V��rin vastaamisen toiminnallisuus.
Luokan Refresh metodissa my�s k�yt�nn�ss� ajetaan koko ohjelma koska se ajaa Peli luokkaa k�ytt�en pelin.
Metodissa my�s m��ritell��n onko kysymys kysytty jolloin Peli-luokka osaa vaihtaa kysymyksen seuraavaan mik�li se on kysytty. Jos kaikki kysymykset jotka kysyt��n on lis�tty kysytyt listaan Metodi lopettaa ohjelman ja Peli-luokkaa k�ytt�en tulostaa tarinan.

Main Luokka k�ytt�� Grafiikkaa ja ajaa ohjelman kokonaisuudessaan.