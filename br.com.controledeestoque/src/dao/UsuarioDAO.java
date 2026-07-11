package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public boolean autenticar(
            String login,
            String senha
    ) throws SQLException {

        String sql = """
                SELECT id_usuario
                FROM usuarios
                WHERE login = ?
                AND senha = ?
                AND ativo = 1
                LIMIT 1
                """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement comando =
                    conexao.prepareStatement(sql)
        ) {

            comando.setString(1, login);
            comando.setString(2, senha);

            try (ResultSet resultado = comando.executeQuery()) {

                return resultado.next();
            }
        }
    }
}