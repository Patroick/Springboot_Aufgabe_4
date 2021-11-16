# Springboot_Aufgabe_4

Dieses Relationssschema wird mithilfe von Spring Data JPA umgesetzt. Spring Data JPA ist eine Schnittstelle um Java Objekte mit Datenbanken zu verknüpfen

![grafik](https://user-images.githubusercontent.com/43811779/142050335-1a4d909d-c41a-445f-a038-98c7acb439f3.png)

# Springboot App erstellen und mit Datenbank verbinden

Springboot Projekt mit Spring Initializr erstellen https://start.spring.io/

![grafik](https://user-images.githubusercontent.com/43811779/142051270-c87d3ed4-4d8b-453a-961e-2a0904be8dc3.png)

Neues Datenbank Schema erstellen

![grafik](https://user-images.githubusercontent.com/43811779/142052443-0b50c282-a07b-420f-bcb6-7ba4bf1760a4.png)

![grafik](https://user-images.githubusercontent.com/43811779/142052480-b508a853-1f25-4720-9158-3b372e456c80.png)

Konfiguration der Datenbank in den properties

![grafik](https://user-images.githubusercontent.com/43811779/142054250-74887030-3a80-4d3d-b885-028e24354724.png)

# Mapping Entities 

Student Entität erstellen 

![grafik](https://user-images.githubusercontent.com/43811779/142055613-b2776d85-dc97-40b1-a553-5e63afeb5709.png)

Nach starten des Programms wird der Table in der Datenbank erstellt

![grafik](https://user-images.githubusercontent.com/43811779/142056291-f1e57662-e593-4405-8b01-8e2045a62a87.png)

# JPA Annotations

Die meisten Annotationen sind bereits aus den beiden vorherigen Projekten bekannt. Neu sind:
`@Table` = Details des Tables können hier definiert werden
`@Column` = Betails der Spalte können hier definiert werden

![grafik](https://user-images.githubusercontent.com/43811779/142058663-baff5859-2828-4e25-8066-5a27b9293b9e.png)

# Repositories und Methoden verstehen

Neues Package für da Student Repository Interface

![grafik](https://user-images.githubusercontent.com/43811779/142063249-22099ebe-41be-452c-8eb1-013665769f9e.png)

![grafik](https://user-images.githubusercontent.com/43811779/142063339-692a5a9d-3915-47b0-bdde-4c16370fef53.png)

Test erstellen

![grafik](https://user-images.githubusercontent.com/43811779/142060798-8d217575-7cd4-46bb-8e85-49733d6e78e2.png)

Test Klasse mit 2 Testmethoden saveStudent und print AllStudents

![grafik](https://user-images.githubusercontent.com/43811779/142063456-cbb09a1b-1612-46fd-b7dd-5c5580d24e08.png)

![grafik](https://user-images.githubusercontent.com/43811779/142062553-46d7a8db-f745-425f-be2f-82609c8ce4ac.png)

![grafik](https://user-images.githubusercontent.com/43811779/142063196-2d7eb3a8-f63e-4589-8539-0e0ca0fe5a81.png)

# Embeddable und @Embedded

`@Embeddable` = Klasse kann von anderen Objeketen eingebunden werden

Die Felder von Guardian werden in eine eigene Klasse ausgelagert und mit `@Embedded` in der Student Klasse eingebunden </br>

Dabei müssen die Felder mit `@AttributeOverride` and den Table angepasst werden.

![grafik](https://user-images.githubusercontent.com/43811779/142066052-55f46eef-7ab0-40d7-9ecf-825745495a6a.png)

In der Student Klasse wird die Guardian Klasse eingebunden

![grafik](https://user-images.githubusercontent.com/43811779/142066189-55e8f5ec-ec93-4eba-8695-2f88f3e71a55.png)

saveStudent muss angepasst werden da die Guardian Attribute nicht mehr in der Student Klasse vorhanden sind </br>
Um den Student mit Guardian Attributen zu speichern wird eine neue Methode saveStudentWithGuardian erstellt

![grafik](https://user-images.githubusercontent.com/43811779/142066294-9dcac502-a948-46e2-8d73-5211b558fae5.png)

![grafik](https://user-images.githubusercontent.com/43811779/142065851-d3a59033-fa4f-45b2-a4f1-348fb0113115.png)

# Repositories und Methoden erstellen

Die Methoden werden im Repository definiert und automatisch implementiert

![grafik](https://user-images.githubusercontent.com/43811779/142070133-360aad5c-cd56-4318-9ce4-a4b911504a42.png)

Testklassen der verschiedenen Methoden

![grafik](https://user-images.githubusercontent.com/43811779/142070246-60612bb4-8cfa-4928-9417-601491a8533e.png)

![grafik](https://user-images.githubusercontent.com/43811779/142070403-4e1ed099-16ab-4a77-bd4d-e66dc36f882d.png)

![grafik](https://user-images.githubusercontent.com/43811779/142070463-1b25c6ba-e3c6-4e7c-a746-c774c6717807.png)

![grafik](https://user-images.githubusercontent.com/43811779/142070504-748214fe-3801-4c68-a8ba-08db32942cce.png)

# Query Annotation

