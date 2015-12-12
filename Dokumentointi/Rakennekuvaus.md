QuizQuest-pelin luokkien rakennekuvaus ikäänkuin hierarkkisessa järjestyksessä.


Seikkailija-luokassa määritellään pelin pelaaja ja asetetaan hänelle aloituspisteet
Luokassa on myös kaikki metodit jotka liittyvät pelaajan nimenmuutoksiin ja Superit pisteiden saantiin/vähennyksiin.
Seikkailija-luokka siis käyttää pisteytys luokkaa.

Pisteytys-luokassa määritellään tarkemmin kuinka pisteitä saadaan nollataan ja asetetaan.

Kysymys-luokassa määritellään yksittäinen kysymys ja sen vastaus, sekä parametri onko se kysytty jo.
Luokassa asetetaan myös Kysymyksen tulostusasu. 

KysymysLista-luokassa käyttää kysymysluokkaa määrittelemään listan kysyttävistä ja kysytyistä kysymyksistä.
Kysyttävät kysymykset laitetaan luokassa listaan. Listalle määritellään metodit sen sekoittamiseen ja tulostamiseen.
Luokassa on myös lista jo kysytyistä kysymyksistä ja metodi joka lisää kysymyksen niihin.

Peli-luokka luo pelin käyttäjän käyttämällä Seikkailija luokkaa, tekee kysymyslistaa käyttäen kysyttävät kysymykset ja määrittää oikean vastauksen. Luokka myös arpoo uuden kysymyksen mikäli se on jo kysytty.
Peli-luokassa on myös metodi lopussa tulostettavalle tarinalle.

Grafiikka luokassa määritellään pelin ulkoasu sekä Oikein ja Väärin vastaamisen toiminnallisuus.
Luokan Refresh metodissa myös käytännössä ajetaan koko ohjelma koska se ajaa Peli luokkaa käyttäen pelin.
Metodissa myös määritellään onko kysymys kysytty jolloin Peli-luokka osaa vaihtaa kysymyksen seuraavaan mikäli se on kysytty. Jos kaikki kysymykset jotka kysytään on lisätty kysytyt listaan Metodi lopettaa ohjelman ja Peli-luokkaa käyttäen tulostaa tarinan.

Main Luokka käyttää Grafiikkaa ja ajaa ohjelman kokonaisuudessaan.