PGDMP                         {         
   FinancePal    14.5    14.4     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394 
   FinancePal    DATABASE     i   CREATE DATABASE "FinancePal" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
    DROP DATABASE "FinancePal";
                postgres    false            �            1259    16428    investments    TABLE     �   CREATE TABLE public.investments (
    id integer NOT NULL,
    name_investment character varying(1000),
    description character varying(1000),
    price integer
);
    DROP TABLE public.investments;
       public         heap    postgres    false            �            1259    16427    investments_id_seq    SEQUENCE     �   ALTER TABLE public.investments ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.investments_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    216            �            1259    16417 
   statistics    TABLE     g   CREATE TABLE public.statistics (
    id integer NOT NULL,
    user_id integer,
    spending integer
);
    DROP TABLE public.statistics;
       public         heap    postgres    false            �            1259    16416    statistics_id_seq    SEQUENCE     �   ALTER TABLE public.statistics ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.statistics_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    214            �            1259    16396    users    TABLE       CREATE TABLE public.users (
    id integer NOT NULL,
    last_name character varying(1000),
    first_name character varying(1000),
    middle_name character varying(1000),
    login character varying(1000),
    password character varying(1000),
    role character varying(1000)
);
    DROP TABLE public.users;
       public         heap    postgres    false            �            1259    16395    users_id_seq    SEQUENCE     �   ALTER TABLE public.users ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    210            �            1259    16404    wallets    TABLE     �   CREATE TABLE public.wallets (
    id integer NOT NULL,
    name_wallet character varying(1000),
    user_id integer,
    money_wallet integer
);
    DROP TABLE public.wallets;
       public         heap    postgres    false            �            1259    16403    wallets_id_seq    SEQUENCE     �   ALTER TABLE public.wallets ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.wallets_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    212            �          0    16428    investments 
   TABLE DATA                 public          postgres    false    216   -       �          0    16417 
   statistics 
   TABLE DATA                 public          postgres    false    214   �       �          0    16396    users 
   TABLE DATA                 public          postgres    false    210   v       �          0    16404    wallets 
   TABLE DATA                 public          postgres    false    212          �           0    0    investments_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.investments_id_seq', 3, true);
          public          postgres    false    215            �           0    0    statistics_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.statistics_id_seq', 2, true);
          public          postgres    false    213            �           0    0    users_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.users_id_seq', 2, true);
          public          postgres    false    209            �           0    0    wallets_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.wallets_id_seq', 3, true);
          public          postgres    false    211                       2606    16434    investments investments_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.investments
    ADD CONSTRAINT investments_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.investments DROP CONSTRAINT investments_pkey;
       public            postgres    false    216                       2606    16421    statistics statistics_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.statistics
    ADD CONSTRAINT statistics_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.statistics DROP CONSTRAINT statistics_pkey;
       public            postgres    false    214                       2606    16402    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    210                       2606    16410    wallets wallets_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.wallets
    ADD CONSTRAINT wallets_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.wallets DROP CONSTRAINT wallets_pkey;
       public            postgres    false    212                       2606    16422 "   statistics statistics_user_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.statistics
    ADD CONSTRAINT statistics_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(id);
 L   ALTER TABLE ONLY public.statistics DROP CONSTRAINT statistics_user_id_fkey;
       public          postgres    false    3091    210    214                       2606    16411    wallets wallets_user_id_fkey    FK CONSTRAINT     {   ALTER TABLE ONLY public.wallets
    ADD CONSTRAINT wallets_user_id_fkey FOREIGN KEY (user_id) REFERENCES public.users(id);
 F   ALTER TABLE ONLY public.wallets DROP CONSTRAINT wallets_user_id_fkey;
       public          postgres    false    210    212    3091            �   �   x���v
Q���W((M��L���+K-.�M�+)V��L�Q�K�M�G��(��'e�d���(e&�j*���y�x��+G���*�9���B�`C�3.콰��֋��.����
�Z���$�]�h���hǅ�PqCMk.Oz���;�p�$ndJ_w�q�1w�č!��� �-;      �   n   x���v
Q���W((M��L�+.I,�,.�L.V��L�Q(-N-�1�R�R2��5��\��<]<���#�C\}�}B]!d�����hZsy��# 2��� �:�      �   �   x���v
Q���W((M��L�+-N-*V��L�Q�I,.��K�M�QH�,��s3SRrR������<�������"�����TM�0נ OO?w����W_�0G�PW��a���nhd���2A�\��i��9P5:"1%73O?�^�`.. �g�      �   �   x���v
Q���W((M��L�+O��I-)V��L�Q�K�M����(��ŃDs��R+�
�a�AA�.�~�
���!��
a�>��2XA�PGA�¬�.v\�za7�z�2�P]G(ad`�i��IWas��@	S����+�!aahv Z���     