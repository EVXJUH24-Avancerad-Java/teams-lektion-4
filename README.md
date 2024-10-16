---
author: Lektion 4
date: MMMM dd, YYYY
paging: "%d / %d"
---

# Teams lektion 4

Hej och välkommen!

## Agenda

1. Frågor och repetition
2. Genomgång av övningar
3. Fortsättning på todo-app
   1. Övning
   2. TaskManager + filsparning
   3. Övning
   4. Flera typer av tasks
4. Övning med handledning

---

# Fråga

Kommer vi få veta någonting om vad vi kan förvänta oss inför gruppuppgiften?

# Svar

Den innehåller ett flertal utmaningar/mindre uppgifter med olika avancerade koncept: reflection, streams, generics m.m.

---

# Fråga

Är det möjligt att använda en TimerTask i todo-appen för att sätta en deadline och/eller hantera upprepande tasks?

# Svar

Ja och nej. Det är möjligt att säga "radera denna task om 5 minuter" eller "upprepa denna task om 10 minuter", men det är bättre att hantera det på annat sätt.

Om en task raderas så måste även alla timers (för samma task) raderas. Det blir mycket mer att hålla koll på. Istället så kan man skapa flera olika "typer" av tasks med hjälp av inheritance och polymorphism.

Vi skall försöka implementera detta idag, om det finns tid för det. Annars så skjuter vi på det till nästa vecka.

---

# Fråga

Hur vet man om man ska "bygga om" sitt projekt från förra kursen med OOP eller om en ska bygga upp sitt nya projekt på nytt?

# Svar

Det är baserat på vad som är enklast. Man kan men måste inte bygga om projektet. Man får själv avgöra om man tror att det är enklare att bygga om eller inte. Om man är osäker så rekommenderar jag att man börjar om.

---

# Fråga

Kan du förklara igen vad Gradle är? Förväntas det av oss att vi ska använda det när vi kodar och lämnar in uppgifter?

# Svar

Det förväntas inte. Gradle är ett "build system" som hanterar många olika saker. För vår användning så behövs det egentligen endast om vi behöver installera 3d party bibliotek, vilket inte är ett måste.

För att hålla det enkelt: när ni skapar projekt i Intellij så väljer ni Gradle, men ni behöver inte göra något med Gradle direkt.

---

# Fråga

Hur kan vi på bästa sätt förbereda oss inför gruppuppgiften den 4/11?

# Svar

Plugga och förstå de avancerade koncept som tas upp. Dessa nämns i kursplanen men här är de också:
- Lambdas
- Generics
- Reflection
- Streams
- Annotations

---

# Gruppövning

Lägg till så att tasks kan sparas till en lista (`List<Task>`). Vid startup skall man få valet att välja mellan fil eller list, och valet används sedan i resterande "session". 
Om man väljer lista så skall alla tasks sparas till en lista.
Om man väljer fil så skall alla tasks sparas till en fil.
Båda används inte samtidigt; det är antingen lista eller fil, men valet för båda skall finnas.

Om man startar om applikationen så får man upp valet igen. Välj genom att exempelvis ha två kommandon: `use-files` & `use-list`.

För den första omgången så skall ni göra detta med todo-appen från förra kursen. I den andra omgången så skall ni använda den senaste appen istället (oop variant). Syftet är att visa hur mycket enklare det är att implementera detta med objekt-orienterad design.
