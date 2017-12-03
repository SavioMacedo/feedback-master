CREATE TABLE CARGO (
    ID BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    NOME VARCHAR(255) NOT NULL
);

CREATE TABLE PESSOA (
    ID BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    NOME VARCHAR(255) NOT NULL,
    SOBRENOME VARCHAR(255) NOT NULL,
    NASCIMENTO TIMESTAMP NOT NULL,
    CARGO BIGINT REFERENCES CARGO(ID),
    FOTO_URL VARCHAR(255),
    EMAIL VARCHAR(255) NOT NULL,
    BIO LONG VARCHAR
);

CREATE TABLE USUARIO (
    ID BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    LOGIN VARCHAR(128) NOT NULL,
    SENHA VARCHAR(32) NOT NULL,
    PERFIL VARCHAR(4) NOT NULL
);
    INSERT INTO USUARIO (LOGIN, SENHA, PERFIL) VALUES ('admin', '4QrcOUm6Wau+VuBX8g+IPg==', 'admn');

    INSERT INTO USUARIO (LOGIN, SENHA, PERFIL) VALUES ('user', '4QrcOUm6Wau+VuBX8g+IPg==', 'user');


/*
CREATE TABLE FEEDBACK (
    ID BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    PESSOA BIGINT REFERENCES PALESTRA(ID),
    DATA_PUBLICACAO DATE NOT NULL,      
    TEXTO LONG VARCHAR NOT NULL
);*/

INSERT INTO CARGO (NOME) VALUES
    ('Administração'),
('Administração Pública'),
('Agronegócios e Agropecuária'),
('Ciências Aeronáuticas'),
('Ciências Atuariais'),
('Ciências Contábeis'),
('Ciências Econômicas'),
('Comércio Exterior'),
('Defesa e Gestão Estratégica Internacional'),
('Gastronomia'),
('Gestão Comercial'),
('Gestão de Recursos Humanos'),
('Gestão de Segurança Privada'),
('Gestão de Seguros'),
('Gestão de Turismo'),
('Gestão Financeira'),
('Gestão Pública'),
('Hotelaria'),
('Logística'),
('Marketing'),
('Negócios Imobiliários'),
('Pilotagem Profissional de Aeronaves'),
('Processos Gerenciais'),
('Segurança Pública'),
('Turismo'),
('Artes e Design'),
('Animação'),
('Arquitetura e Urbanismo'),
('Artes Visuais'),
('Comunicação das Artes do Corpo'),
('Conservação e Restauro'),
('Dança'),
('Design'),
('Design de Games'),
('Design de Interiores'),
('Design de Moda'),
('Fotografia'),
('História da Arte'),
('Jogos Digitais'),
('Luteria'),
('Música'),
('Produção Cênica'),
('Produção Fonográfica'),
('Teatro'),
('Ciências Biológicas e da Terra'),
('Agroecologia'),
('Agronomia'),
('Alimentos'),
('Biocombustíveis'),
('Biotecnologia'),
('Biotecnologia e Bioquímica'),
('Ciência e Tecnologia de Alimentos'),
('Ciências Agrárias'),
('Ciências Biológicas'),
('Ciências Naturais e Exatas'),
('Ecologia'),
('Geofísica'),
('Geologia'),
('Gestão Ambiental'),
('Medicina Veterinária'),
('Meteorologia'),
('Oceanografia'),
('Produção de Bebidas'),
('Produção Sucroalcooleira'),
('Rochas Ornamentais'),
('Zootecnia'),
('Ciências Exatas e Informática'),
('Análise e Desenvolvimento de Sistemas'),
('Astronomia'),
('Banco de Dados'),
('Ciência da Computação'),
('Ciência e Tecnologia'),
('Computação'),
('Estatística'),
('Física'),
('Gestão da Tecnologia da Informação'),
('Informática Biomédica'),
('Matemática'),
('Nanotecnologia'),
('Química'),
('Redes de Computadores'),
('Segurança da Informação'),
('Sistemas de Informação'),
('Sistemas para Internet'),
('Ciências Sociais e Humanas'),
('Arqueologia'),
('Ciências do Consumo'),
('Ciências Humanas'),
('Ciências Sociais'),
('Cooperativismo'),
('Direito'),
('Escrita Criativa'),
('Estudos de Gênero e Diversidade'),
('Filosofia'),
('Geografia'),
('Gestão de Cooperativas'),
('História'),
('Letras'),
('Libras'),
('Linguística'),
('Museologia'),
('Pedagogia'),
('Psicopedagogia'),
('Relações Internacionais'),
('Serviço Social'),
('Serviços Judiciários e Notariais'),
('Teologia'),
('Tradutor e Intérprete'),
('Comunicação e Informação'),
('Arquivologia'),
('Biblioteconomia'),
('Cinema e Audiovisual'),
('Comunicação em Mídias Digitais'),
('Comunicação Institucional'),
('Comunicação Organizacional'),
('Educomunicação'),
('Estudos de Mídia'),
('Eventos'),
('Gestão da Informação'),
('Jornalismo'),
('Produção Audiovisual'),
('Produção Cultural'),
('Produção Editorial'),
('Produção Multimídia'),
('Produção Publicitária'),
('Publicidade e Propaganda'),
('Rádio, TV e Internet'),
('Relações Públicas'),
('Secretariado'),
('Secretariado Executivo'),
('Engenharia e Produção'),
('Agrimensura'),
('Aquicultura'),
('Automação Industrial'),
('Construção Civil'),
('Construção Naval'),
('Eletrônica Industrial'),
('Eletrotécnica Industrial'),
('Energias Renováveis'),
('Engenharia Acústica'),
('Engenharia Aeronáutica'),
('Engenharia Agrícola'),
('Engenharia Ambiental e Sanitária'),
('Engenharia Biomédica'),
('Engenharia Bioquímica, de Bioprocessos e Biotecnologia'),
('Engenharia Cartográfica e de Agrimensura'),
('Engenharia Civil'),
('Engenharia da Computação'),
('Engenharia de Alimentos'),
('Engenharia de Biossistemas'),
('Engenharia de Controle e Automação'),
('Engenharia de Energia'),
('Engenharia de Inovação'),
('Engenharia de Materiais'),
('Engenharia de Minas'),
('Engenharia de Pesca'),
('Engenharia de Petróleo'),
('Engenharia de Produção'),
('Engenharia de Segurança no Trabalho'),
('Engenharia de Sistemas'),
('Engenharia de Software'),
('Engenharia de Telecomunicações'),
('Engenharia de Transporte e da Mobilidade'),
('Engenharia Elétrica'),
('Engenharia Eletrônica'),
('Engenharia Física'),
('Engenharia Florestal'),
('Engenharia Hídrica'),
('Engenharia Industrial Madeireira'),
('Engenharia Mecânica'),
('Engenharia Mecatrônica'),
('Engenharia Metalúrgica'),
('Engenharia Naval'),
('Engenharia Nuclear'),
('Engenharia Química'),
('Engenharia Têxtil'),
('Fabricação Mecânica'),
('Geoprocessamento'),
('Gestão da Produção Industrial'),
('Gestão da Qualidade'),
('Irrigação e Drenagem'),
('Manutenção de Aeronaves'),
('Manutenção Industrial (T/L)'),
('Materiais'),
('Mecatrônica Industrial'),
('Mineração'),
('Papel e Celulose'),
('Petróleo e Gás'),
('Processos Metalúrgicos'),
('Processos Químicos'),
('Produção Têxtil'),
('Saneamento Ambiental'),
('Segurança no Trabalho'),
('Silvicultura'),
('Sistemas Biomédicos'),
('Sistemas de Telecomunicações'),
('Sistemas Elétricos'),
('Sistemas Embarcados'),
('Transporte'),
('Outras'),
('Artes'),
('Biossistemas'),
('Ciência da Terra'),
('Ciência e Economia'),
('Ciência e Tecnologia'),
('Ciência e Tecnologia das Águas/do Mar'),
('Ciências Agrárias'),
('Ciências da Natureza e suas Tecnologias'),
('Cultura, Linguagens e Tecnologias Aplicadas'),
('Energia e Sustentabilidade'),
('Humanidades'),
('Linguagens e Códigos e suas Tecnologias'),
('Matemática e Computação e suas Tecnologias'),
('Saúde'),
('Tecnologia da Informação'),
('Saúde e Bem-Estar'),
('Biomedicina'),
('Educação Física'),
('Enfermagem'),
('Esporte'),
('Estética e Cosmética'),
('Farmácia'),
('Fisioterapia'),
('Fonoaudiologia'),
('Gerontologia'),
('Gestão Desportiva e de Lazer'),
('Gestão em Saúde'),
('Gestão Hospitalar'),
('Medicina'),
('Musicoterapia'),
('Naturologia'),
('Nutrição'),
('Obstetrícia'),
('Odontologia'),
('Oftálmica'),
('Optometria'),
('Psicologia'),
('Quiropraxia'),
('Radiologia'),
('Saúde Coletiva'),
('Terapia Ocupacional');