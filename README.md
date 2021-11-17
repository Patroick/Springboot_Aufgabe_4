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

Wenn Methoden nicht mittels der Repository Keywords automatisch Implementiert werden kann müssen Query Annotationen verwendet werden

![grafik](https://user-images.githubusercontent.com/43811779/142073571-16470ecc-9fe0-4781-9c34-7941a734bf6b.png)

Testklasse

![grafik](https://user-images.githubusercontent.com/43811779/142073649-555f84c9-660f-4806-8917-139f9b8f84a3.png)

![grafik](https://user-images.githubusercontent.com/43811779/142073688-e78d45d2-a35e-49b5-94d1-568dee695e33.png)

![grafik](https://user-images.githubusercontent.com/43811779/142073732-f92f698d-0cc7-4d7b-a4af-e9b67643d21c.png)

# Native Queries

Bei Nativen Queries wird SQL Code verwendet

![grafik](https://user-images.githubusercontent.com/43811779/142075228-27637ebc-6539-4a55-a38b-e7184539a505.png)

Testklasse

![grafik](https://user-images.githubusercontent.com/43811779/142075269-d32af038-5509-4678-9caf-4097e51f0abc.png)

# Query Named Params

![grafik](https://user-images.githubusercontent.com/43811779/142076278-d52ecafe-a161-4afb-9c5d-965a4a82e021.png)

Testklasse

![grafik](https://user-images.githubusercontent.com/43811779/142076339-73d02f7d-9757-4a06-ab2d-ffe4072828de.png)

# Transactional und @Modifying Annotation

`@Modifying` = erlaubt es Daten mit der Query zu verändern </br>
`@Transactional` = makiert die Query als Tranasktion, heißt wenn die Tranasktion nicht abgeschlossen werden konnte wird sie komplett abgebrochen

![grafik](https://user-images.githubusercontent.com/43811779/142077038-5d3b7742-57fa-4c06-b455-5a98a2b3a66a.png)

Testklasse

![grafik](https://user-images.githubusercontent.com/43811779/142077379-39eb6acd-eb25-47cc-a8c7-ca912cb447b3.png)

![grafik](https://user-images.githubusercontent.com/43811779/142077406-1702013b-8ac8-4bde-8608-71286588219d.png)

# One to One Relationship

Zunächst 2 neue Entitäten 

![grafik](https://user-images.githubusercontent.com/43811779/142078036-f8366bb5-dff6-402d-95be-736a1b6672cd.png)

Die Entitäten sind im Prinzip gleich aufgebaut wie Student 

Course Material darf nicht alleine existieren deshalb muss die Klasse mit einer One to One Beziehung mit der Klasse Course verbunden sein </br>
`@OneToOne` = markiert das Datenfeld als One to One Beziehung </br>
`@JoinColumn` definiert die Spalte die für den Join verwendet wird

![grafik](https://user-images.githubusercontent.com/43811779/142078964-b8c5ecc3-74ad-4ca6-8c18-485683ec1d71.png)

![grafik](https://user-images.githubusercontent.com/43811779/142080994-542df8a0-cb68-4646-b2f5-a88ab3fbea1b.png)

2 neue Repositories CourseMaterialRepository und CourseRepository

![grafik](https://user-images.githubusercontent.com/43811779/142081241-92079220-af34-447a-98e2-4de7a1ddcef9.png)

Für CourseMaterialRepository eine Testklasse erstellen

![grafik](https://user-images.githubusercontent.com/43811779/142081375-e9b9d7df-191e-4e3f-83ac-73e5f032f486.png)

Diese Testklasse funktioniert nicht da noch kein Course gespeichert wurde und CourseMaterial nicht alleine existieren kann

![grafik](https://user-images.githubusercontent.com/43811779/142082285-fdb393cc-1224-4501-8f34-295c679b17c1.png)

## Cascading

Dies kann gelöst werden indem bei CourseMaterial bei der `@OneToOne` Annotation ein cascade Typ mitgegeben wird

![grafik](https://user-images.githubusercontent.com/43811779/142082614-2e256484-5941-4a85-9748-72cdf8d4ecce.png)

Wenn der Test nun durchgeführt wird funktioniert er 

![grafik](https://user-images.githubusercontent.com/43811779/142082683-cec38dc0-4ced-47fb-8213-982648913a95.png)

![grafik](https://user-images.githubusercontent.com/43811779/142082720-88605a41-1a25-490d-baae-eb8dc03e60f1.png)

![grafik](https://user-images.githubusercontent.com/43811779/142082742-fa758146-2543-4aaa-86ba-4d66c7fe2f32.png)

# Fetch Types

Zuerst wird bei der `@OneToOne` Annotation der fetch Typ auf Lazy gestellt

![grafik](https://user-images.githubusercontent.com/43811779/142083354-a4a8ba6d-dffa-4bb2-b152-0cc1083fdcac.png)

Damit funktioniert dieser Test nicht

![grafik](https://user-images.githubusercontent.com/43811779/142083398-89b34179-121e-4a4d-ad23-948dae3ae951.png)

Wenn Course hiervon ausgenommen wird funktioniert der Test

![grafik](https://user-images.githubusercontent.com/43811779/142083550-deb158a4-de14-42b1-8a6c-6f390afd332c.png)

![grafik](https://user-images.githubusercontent.com/43811779/142083568-469e7d7c-7727-4eaf-80d5-c9032c84bf59.png)

# Uni & Bi directional relationships

Test für CourseRepository erstellen </br>

![grafik](https://user-images.githubusercontent.com/43811779/142084435-917b3ec6-c980-4670-afc9-c1c8495961ef.png)

![grafik](https://user-images.githubusercontent.com/43811779/142084446-dd9f8e87-915f-4760-9a3d-48b99690f103.png)

Wenn bei Course eine Bi direktionale OneToOne Beziehung hinzugefügt wird, wird beim Test neben Course auch CourseMaterial ausgegeben

![grafik](https://user-images.githubusercontent.com/43811779/142084863-ddd25ce4-bba5-4ca0-98e6-0aaf7196de68.png)


![grafik](https://user-images.githubusercontent.com/43811779/142084845-82a35db5-94d0-4423-bf2d-c6695fe820bf.png)

# One to Many Relationship

Zuerst muss eine neue Entität Teacher erstellt werden 

![grafik](https://user-images.githubusercontent.com/43811779/142085414-74ce28e4-3be3-48e0-a466-ad5dfccb1861.png)

![grafik](https://user-images.githubusercontent.com/43811779/142086106-300a2ec7-9116-4a09-9405-57082c7da991.png)

Beim ausführen des Programms wird nun die neue Tabelle Teacher erstellt

![grafik](https://user-images.githubusercontent.com/43811779/142086172-b9e5fc17-4891-43b0-9190-fcf7a7003579.png)

Für Teacher muss ein neues Repository erstellt werden

![grafik](https://user-images.githubusercontent.com/43811779/142086402-708dc5af-b7d8-44ec-874e-e80d7d255563.png)

und eine Testklasse

![grafik](https://user-images.githubusercontent.com/43811779/142087526-4925d78f-9acb-44d0-b7cb-af9eba64d616.png)

![grafik](https://user-images.githubusercontent.com/43811779/142087555-acb2a2e1-0031-4e44-885e-81c538c1207b.png)

Mit optional = false kann die Optionalität von einträgen deaktiviert werden 

![grafik](https://user-images.githubusercontent.com/43811779/142087787-dbe3ff62-508a-4af5-b66c-db6353868634.png)

Wenn in der Test Klasse kein Kurs mehr gespeichert wird schlägt der test fehl

![grafik](https://user-images.githubusercontent.com/43811779/142087933-2eea79e8-00e1-48ef-b066-09a94e7114ec.png)

# Many to One Relationship

Die One to Many Beziehung in der Teacher Klasse mus entfernt werden

![grafik](https://user-images.githubusercontent.com/43811779/142088132-dac371bc-7743-4fcd-9bcf-cf91dcc64895.png)

In der Course Klasse muss dann die Many to One Relationship hinzugefügt werden

![grafik](https://user-images.githubusercontent.com/43811779/142089121-fae66a0b-b18a-4b95-bc0a-3a2c4f793b62.png)

Testklasse

![grafik](https://user-images.githubusercontent.com/43811779/142089157-16bd2c29-a03c-45ef-929f-f6f6a096ad16.png)

![grafik](https://user-images.githubusercontent.com/43811779/142089169-ea9f6021-fb7d-4b74-844e-7620d4d0fa18.png)

# Paging and Sorting

Testklasse Paging

![grafik](https://user-images.githubusercontent.com/43811779/142091252-2312db91-a3e5-4a62-be4c-97b2684eade4.png)

![grafik](https://user-images.githubusercontent.com/43811779/142091285-d5545beb-2214-4428-800c-5cb7277bf051.png)

Testklasse Sorting

![grafik](https://user-images.githubusercontent.com/43811779/142091684-db502685-c5e2-462a-b566-dbf80c79a51c.png)

![grafik](https://user-images.githubusercontent.com/43811779/142091709-5132d5f3-a23a-4a9b-b660-f50fb7f0cfa6.png)

Neue Methode im CourseRepository 

![grafik](https://user-images.githubusercontent.com/43811779/142092362-8bfff04d-713a-4022-9316-f6ab7182a516.png)

Testmethode

![grafik](https://user-images.githubusercontent.com/43811779/142092397-3d5ec689-7a69-4133-966b-e1bcaf70a6e3.png)

![grafik](https://user-images.githubusercontent.com/43811779/142092415-3cb3b5ec-a0c7-4f2f-b8bb-8993f47c5881.png)

# Many to Many Relationship

Die Many zu Many Beziehung muss in der Course Klasse hinzugefügt werden

![grafik](https://user-images.githubusercontent.com/43811779/142095333-9baf028d-c2a2-4aca-b19a-b24f6b59211f.png)

Testklasse

![grafik](https://user-images.githubusercontent.com/43811779/142095371-19c3ea20-cde4-453a-8cff-902cbefd11f3.png)

![grafik](https://user-images.githubusercontent.com/43811779/142095512-bc9ccfd3-d711-4a5b-97e8-206fbaca46bf.png)
