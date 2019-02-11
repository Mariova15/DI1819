﻿using GestionAvituallamiento.logica;
using GestionAvituallamiento.modelo;
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
using System.Windows.Shapes;

namespace GestionAvituallamiento
{
    /// <summary>
    /// Lógica de interacción para AnnadirMaterial.xaml
    /// </summary>
    public partial class AnnadirMaterial : Window
    {
        public Avituallamiento avituallamiento { get; set; }
        public MaterialDisponible materialDisponible { get; set; }
        public List<String> tiposDeMaterial { get; set; }

        public AnnadirMaterial(Avituallamiento avituallamiento)
        {
            InitializeComponent();

            this.avituallamiento = avituallamiento;

            tiposDeMaterial = new List<string>() { "Bebida", "Comida", "Material sanitario" };

            materialDisponible = new MaterialDisponible();

            this.DataContext = this;
        }


        private void ButtonAnnadirMaterial_Click(object sender, RoutedEventArgs e)
        {

            avituallamiento.listaMateriales.Add(materialDisponible);
            MessageBox.Show("Material añadido");

        }
    }
}