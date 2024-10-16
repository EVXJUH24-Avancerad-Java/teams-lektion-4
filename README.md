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

# Gruppövning

Lägg till så att tasks kan sparas till en lista (`List<Task>`). Vid startup skall man få valet att välja mellan fil eller list, och valet används sedan i resterande "session". 
Om man väljer lista så skall alla tasks sparas till en lista.
Om man väljer fil så skall alla tasks sparas till en fil.
Båda används inte samtidigt; det är antingen lista eller fil, men valet för båda skall finnas.

Om man startar om applikationen så får man upp valet igen. Välj genom att exempelvis ha två kommandon: `use-files` & `use-list`.

För den första omgången så skall ni göra detta med todo-appen från förra kursen. I den andra omgången så skall ni använda den senaste appen istället (oop variant). Syftet är att visa hur mycket enklare det är att implementera detta med objekt-orienterad design.
