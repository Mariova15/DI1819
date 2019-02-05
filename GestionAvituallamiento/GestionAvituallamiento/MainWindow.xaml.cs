﻿using GestionAvituallamiento.Logica;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace GestionAvituallamiento
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        GestionApp gestionApp;

        public MainWindow()
        {
            InitializeComponent();
            gestionApp = new GestionApp();
            
        }

        private void ButtonPrueba_Click(object sender, RoutedEventArgs e)
        {
            Prueba p = new Prueba(gestionApp);
            p.ShowDialog();
        }

        private void buttonCrear_Click(object sender, RoutedEventArgs e)
        {
            CrearAvituallamientos crearAvituallamiento = new CrearAvituallamientos(gestionApp);
            crearAvituallamiento.ShowDialog();
        }
    }
}