SELECT COUNT(a.co_aluno) as qtdAluno, al.no_aluno_situacao FROM aluno a
INNER JOIN matricula m ON m.aluno = a.co_aluno
INNER JOIN aluno_situacao al ON al.co_aluno_situacao = m.aluno_situacao
GROUP BY al.co_aluno_situacao
ORDER BY qtdAluno DESC;