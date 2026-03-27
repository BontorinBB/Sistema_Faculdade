Modelagem do sistema de alunos e professores da faculdade, contendo as entidades e seus relacionamentos e características.



Entidades:

* Aluno
* Professor
* Atividade
* Nota



Atributos:

**Aluno**

* nome
* matrícula



**Professor**

* nome
* id



**Atividade**

* título
* descrição



**Nota**

* valor
* aluno
* atividade



**Relacionamentos:**

* Um professor pode criar várias atividades
* Um aluno pode ver e enviar as atividades postadas pelo professor
* Um professor pode lançar notas
* Uma nota está associada a um aluno e a uma atividade
* Um aluno não pode lançar atividades nem notas
