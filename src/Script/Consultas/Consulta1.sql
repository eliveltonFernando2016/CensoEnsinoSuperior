SELECT COUNT(a.co_aluno) as quantidade FROM aluno a
INNER JOIN matricula m ON m.aluno = a.co_aluno
INNER JOIN ies i ON i.co_ies = m.ies
WHERE m.ano_ingresso BETWEEN 2009 and 2010;