package com.example.kanoon.presentation.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

//@Composable
//fun AppNavigator(navController: NavHostController) {
//    val navController = rememberNavController()
//    val backStackEntry by navController.currentBackStackEntryAsState()
//    val currentRoute = backStackEntry?.destination?.route
//
//    val bottomItems = listOf(
//        MenuItem.Home, MenuItem.AiAssistant, MenuItem.MyProgress, MenuItem.MyCourses
//    )
//
//    val routesWithoutBottomBar = setOf("aiassistant")
//    val showBottomBar = currentRoute !in routesWithoutBottomBar
//
//    Scaffold(
//        containerColor = Color.Transparent,
//        bottomBar = {
//            if (showBottomBar) {
//                Box(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(start = 20.dp, end = 20.dp, bottom = 20.dp, top = 10.dp)
//                        .background(Color.Transparent)
//                ) {
//                    Box(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(70.dp)
//                            .border(2.dp, color = Color.Black, shape = RoundedCornerShape(35.dp))
//                            .shadow(elevation = 8.dp, shape = RoundedCornerShape(35.dp))
//                            .clip(RoundedCornerShape(35.dp))
//                            .background(Color(0xFF5E818E))
//                    ) {
//                        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
//                            Row(
//                                modifier = Modifier.fillMaxSize(),
//                                horizontalArrangement = Arrangement.SpaceEvenly,
//                                verticalAlignment = Alignment.CenterVertically
//                            ) {
//                                bottomItems.forEach { item ->
//                                    val isSelected = currentRoute == item.route
//
//                                    NavigationBarItemCustom(
//                                        item = item, isSelected = isSelected, onClick = {
//                                            navController.navigate(item.route) {
//                                                launchSingleTop = true
//                                                restoreState = true
//                                                popUpTo(navController.graph.startDestinationId) {
//                                                    saveState = true
//                                                }
//                                            }
//                                        })
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        })
//    { innerPadding ->
//        NavHost(
//            navController = navController,
//            startDestination = MenuItem.Home.route,
//            modifier = Modifier.padding(innerPadding)
//        ) {
//            composable(MenuItem.Home.route) {
//            }
//
//            composable(MenuItem.AiAssistant.route) {
//            }
//
//            composable(MenuItem.MyProgress.route) {
//            }
//
//            composable(MenuItem.MyCourses.route) {
//            }
//        }
//    }
//}
//
//@Composable
//fun NavigationBarItemCustom(
//    item: MenuItem, isSelected: Boolean, onClick: () -> Unit
//) {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier
//            .clickable(onClick = onClick)
//            .padding(vertical = 4.dp)
//    ) {
//        val iconRes = if (isSelected && item.selectedIcon != null) item.selectedIcon else item.icon
//
//        Icon(
//            painter = painterResource(id = iconRes),
//            contentDescription = item.title,
//            tint = if (isSelected) Color.White else Color.White.copy(alpha = 0.6f),
//            modifier = Modifier.size(if (isSelected) 30.dp else 26.dp)
//        )
//
//        Spacer(modifier = Modifier.height(4.dp))
//
//        Text(
//            text = item.title,
//            style = MaterialTheme.typography.labelSmall,
//            color = if (isSelected) Color.White else Color.White.copy(alpha = 0.6f),
//            fontSize = 10.sp,
//            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
//        )
//    }
//}
//
//






